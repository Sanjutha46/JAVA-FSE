#4. Git-HOL
## Objective

Create and resolve a merge conflict using Git branches, update the `.gitignore` file, and clean up the repository.

---

## Commands Performed

### 1. Check Repository Status

```bash
git status
```

### 2. Create a New Branch

```bash
git branch GitWork
```

### 3. Switch to the New Branch

```bash
git checkout GitWork
```

### 4. Create `hello.xml`

```bash
echo "<message>Hello from GitWork</message>" > hello.xml
```

### 5. Check Status

```bash
git status
```

### 6. Add the File

```bash
git add hello.xml
```

### 7. Commit the File

```bash
git commit -m "Added hello.xml in GitWork"
```

### 8. Switch Back to Master

```bash
git checkout master
```

### 9. Create `hello.xml` with Different Content

```bash
echo "<message>Hello from Master</message>" > hello.xml
```

### 10. Add and Commit the File

```bash
git add hello.xml
git commit -m "Added hello.xml in master"
```

### 11. View Commit History

```bash
git log --oneline --graph --decorate --all
```

### 12. Compare the Branches

```bash
git diff master GitWork
```

### 13. Merge the Branch

```bash
git merge GitWork
```

### 14. Resolve the Merge Conflict

Edit `hello.xml`, save the resolved content, then run:

```bash
git add hello.xml
git commit -m "Resolved merge conflict in hello.xml"
```

### 15. Update `.gitignore`

Add the following line:

```text
*.bak
```

### 16. Commit `.gitignore`

```bash
git add .gitignore
git commit -m "Updated .gitignore to ignore backup files"
```

### 17. Delete the Branch

```bash
git branch -d GitWork
```

### 18. Verify Repository Status

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

- `hello.xml`

## Files Updated

- `.gitignore`

Final `.gitignore`:

```text
*.log
log/
*.bak
```

---

## Result

Successfully created a merge conflict, resolved it manually, merged the branch into the master branch, updated `.gitignore`, deleted the merged branch, and verified that the repository was clean.
