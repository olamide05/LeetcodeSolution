import os
import re

LEETCODE_URL = "https://leetcode.com/problems/"

def get_solution_files():
    """Finds all Python files in the current directory, excluding this script."""
    files = []
    for filename in os.listdir('.'):
        if filename.endswith(".py") and filename != "generate_readme.py":
            files.append(filename)
    return files

def extract_details_from_file(filename):
    """Extracts problem details from comments inside the Python file."""
    with open(filename, 'r') as f:
        content = f.read()

        # Regex to find details like: # 1. Two Sum | Difficulty: Easy
        match = re.search(r"#\s*(\d+)\.\s*(.*?)\s*\|\s*Difficulty:\s*(Easy|Medium|Hard)", content)

        if not match:
            return None

        number = int(match.group(1))
        title = match.group(2).strip()
        difficulty = match.group(3).strip()

        # Create a URL-friendly slug from the title
        title_slug = title.lower().replace(' ', '-')

        return {
            "number": number,
            "title": title,
            "difficulty": difficulty,
            "url": f"{LEETCODE_URL}{title_slug}/",
            "solution_file": filename
        }

def main():
    """Generates the README.md file."""
    solution_files = get_solution_files()
    solutions = []

    for filename in solution_files:
        details = extract_details_from_file(filename)
        if details:
            solutions.append(details)

    # Sort solutions by problem number
    solutions.sort(key=lambda x: x['number'])

    # Write to README.md
    with open("README.md", "w") as f:
        f.write("# LeetCode Solutions in Python\n\n")
        f.write("A repository of my solutions to LeetCode problems.\n\n")
        f.write("| # | Title | Solution | Difficulty |\n")
        f.write("|---| ----- | -------- | ---------- |\n")

        for s in solutions:
            title_link = f"[{s['title']}]({s['url']})"
            solution_link = f"[Python](./{s['solution_file']})"
            f.write(f"| {s['number']} | {title_link} | {solution_link} | {s['difficulty']} |\n")

    print(f"✅ README.md generated successfully with {len(solutions)} solutions.")


if __name__ == "__main__":
    main()