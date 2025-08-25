# Contributing to DSA-JavaVerse

First off, thanks for taking the time to contribute! 🎉  
We welcome contributions from **beginners to advanced developers**. Whether it’s fixing a typo, adding a new algorithm, or optimizing existing code, every contribution counts.

---

## How to Contribute

### 1. Fork the Repository
Click the **Fork** button at the top-right of this repo to create your own copy.

### 2. Clone the Forked Repository
```bash
git clone https://github.com/your-username/DSA-JavaVerse.git
cd DSA-JavaVerse
```
3. Create a New Branch
```bash
git checkout -b feature/your-feature-name
```
Example:
```bash
git checkout -b feature/add-binary-search
```
4. Add Your Contribution
Add your Java code in the correct folder (e.g., arrays/, graphs/, dp/).
Use meaningful variable names.
Include comments explaining the logic.
Mention Time Complexity & Space Complexity in comments.

Example:
```bash
// Problem: Binary Search in a sorted array
// Time Complexity: O(log n)
// Space Complexity: O(1)

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
```
5. Commit Your Changes
```bash
git add .
git commit -m "Added Binary Search implementation in arrays"
```
6. Push to Your Fork
```bash
git push origin feature/your-feature-name
```
7. Open a Pull Request
- Go to the original repository on GitHub
- Click New Pull Request
- Compare your branch with the main branch
- Submit the PR 

 ## Contribution Rules
- Place files in the correct category folder.
- Do not submit duplicate solutions (unless it’s a different approach).
- Keep code clean and readable.
- Add proper comments & complexities.
- Follow naming convention:
   ProblemName.java (e.g., ReverseArray.java, BinarySearch.java)

## Recognition
Contributors will be listed in the Contributors Section of the README.
Your GitHub profile will also appear under the project’s contributors list automatically once your PR is merged. 🚀

## Need Help?
If you get stuck:
- Check the Issues tab for open discussions.
- Create a new issue if you have questions.
