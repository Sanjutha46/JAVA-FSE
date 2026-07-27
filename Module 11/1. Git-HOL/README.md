# 1. Git-HOL

## Objective
Perform basic Git operations:
- Initialize a Git repository
- Create a file
- Add the file to the staging area
- Commit the file
- Check the repository status

---

## Commands Performed

### 1. Check Git Installation

```bash
git --version
```

---

### 2. Check Git Configuration

```bash
git config --global --list
```

---

### 3. Initialize Git Repository

```bash
git init
```

---

### 4. Check Repository Status

```bash
git status
```

---

### 5. Create a File

```bash
echo Welcome to Git > welcome.txt
```

---

### 6. Verify the File

```bash
dir
```

---

### 7. View File Content

```bash
type welcome.txt
```

---

### 8. Check Git Status

```bash
git status
```

---

### 9. Add File to Staging Area

```bash
git add welcome.txt
```

---

### 10. Verify Staging Area

```bash
git status
```

---

### 11. Commit the File

```bash
git commit -m "Added welcome.txt"
```

---

### 12. Verify Working Tree

```bash
git status
```

Expected Output:

```
On branch master
nothing to commit, working tree clean
```

---

## Files Created

- `welcome.txt`

Contents of `welcome.txt`:

```
Welcome to Git
```

---

## Result

Successfully initialized a Git repository, created a file, added it to the staging area, committed it to the local repository, and verified that the working tree is clean.
