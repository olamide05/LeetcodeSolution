import os

# Tags you're using
TAGS = ["arrays", "hashing", "stacks", "two-pointers", "binary-search"]

# Track stats
total = 0
stats = {tag: 0 for tag in TAGS}

# Count .java files per tag
for tag in TAGS:
    path = os.path.join(".", tag)
    if os.path.exists(path):
        files = [f for f in os.listdir(path) if f.endswith(".java")]
        stats[tag] = len(files)
        total += stats[tag]

# Optional: categorize by difficulty manually
easy = medium = hard = "XX"

# Generate README content
readme = f"""<h1 align="center">🧠 LeetCode Java Solutions</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=java" />
  <img src="https://img.shields.io/badge/Problems%20Solved-{total}+-brightgreen?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Organized%20By-Tags-blueviolet?style=for-the-badge" />
</p>

<p align="center">
  Welcome to my curated collection of <strong>LeetCode Java solutions</strong>, organized by core algorithmic patterns and tags.<br>
  Built for learning, reviewing, and mastering DSA techniques — one problem at a time.
</p>

---

## 📚 Table of Contents

- [📁 Folder Structure](#-folder-structure)
- [🏷️ Tags Covered](#️-tags-covered)
- [📈 Progress](#-progress)
- [🛠️ Tools Used](#️-tools-used)
- [🔗 Useful Links](#-useful-links)
- [📜 Disclaimer](#-disclaimer)

---

## 📁 Folder Structure

```bash
.
{chr(10).join([f"├── {tag}/" for tag in TAGS])}
└── README.md
