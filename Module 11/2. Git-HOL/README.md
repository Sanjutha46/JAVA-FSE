2. Git-HOL
## Objective
Implement the `.gitignore` file to ignore unwanted files and folders from the Git repository.

---

## Commands Performed

### 1. Check Repository Status

```bash
git status
```

---

### 2. Create a Folder

```bash
mkdir log
```

---

### 3. Create a Log File

```bash
New-Item error.log -ItemType File
```

---

### 4. Create a Log File Inside the Folder

```bash
New-Item log\app.log -ItemType File
```

---

### 5. Verify Files

```bash
dir
```

---

### 6. Check Git Status

```bash
git status
```

---

### 7. Create a `.gitignore` File

```bash
New-Item .gitignore -ItemType File
```

---

### 8. Open the `.gitignore` File

```bash
code .gitignore
```

---

### 9. Add the Following Content

```text
*.log
log/
```

---

### 10. Verify Ignored Files

```bash
git status
```

Only `.gitignore` appears as an untracked file because all `.log` files and the `log` folder are ignored.

---

### 11. Add `.gitignore`

```bash
git add .gitignore
```

---

### 12. Commit Changes

```bash
git commit -m "Added .gitignore to ignore log files"
```

---

### 13. Verify Repository Status

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

- `.gitignore`
- `error.log` (ignored)
- `log/` (ignored)
- `log/app.log` (ignored)

---

## .gitignore Content

```text
*.log
log/
```

---

## Result

Successfully implemented a `.gitignore` file to ignore all `.log` files and the `log` folder. Verified that Git does not track the ignored files and the repository remains clean after committing the `.gitignore` file.
