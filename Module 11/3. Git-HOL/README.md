#3. Git-HOL

## Objective

Learn Git branching and merging by creating a new branch, making changes, merging the branch into the master branch, and deleting the merged branch.

---

## Commands Performed

### 1. Check Repository Status

```bash
git status
```

---

### 2. Create a New Branch

```bash
git branch GitNewBranch
```

---

### 3. List Available Branches

```bash
git branch
```

---

### 4. Switch to the New Branch

```bash
git checkout GitNewBranch
```

---

### 5. Verify Current Branch

```bash
git branch
```

---

### 6. Create a File in the New Branch

```bash
echo This file was created in GitNewBranch > branch.txt
```

---

### 7. Check Repository Status

```bash
git status
```

---

### 8. Add the File

```bash
git add branch.txt
```

---

### 9. Commit the Changes

```bash
git commit -m "Added branch.txt in GitNewBranch"
```

---

### 10. Verify Repository Status

```bash
git status
```

---

### 11. Switch Back to Master Branch

```bash
git checkout master
```

---

### 12. Compare Master and Branch

```bash
git diff master GitNewBranch
```

---

### 13. Merge the Branch into Master

```bash
git merge GitNewBranch
```

---

### 14. View Commit History

```bash
git log --oneline --graph --decorate
```

---

### 15. Delete the Merged Branch

```bash
git branch -d GitNewBranch
```

---

### 16. Verify Available Branches

```bash
git branch
```

---

### 17. Check Final Repository Status

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

- `branch.txt`

Contents:

```
This file was created in GitNewBranch
```

---

## Result

Successfully created a new branch, switched to it, added and committed changes, merged the branch into the master branch, viewed the commit history, deleted the merged branch, and verified that the repository was clean.
