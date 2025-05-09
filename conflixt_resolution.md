# Conflict Шийдвэрлэлт


## Conflict-ийн file:
`src/main/java/lab15/sict/must/edu/mn/Division.java`

## Conflict-ийн дэлгэрэнгүй:
1. "Develop"-ийг "feature/add-division"-д merge хийхийг оролдсон.
2. `Division.java` дээрх зөрчилтэй сэтгэгдлүүдийн улмаас merge хийхийг оролдоход conflict үүссэн.
3. "Develop" дээрх comment-ийг "Accept Current" дарж авч үлдсэн.
4. Дараагаар нь "Resolve Merge Editor" дарж merge хийсэн.

## 💻 Git Commands Used:
```bash
git checkout feature/add-division
git merge develop
# (conflict happens)
# manually edit Division.java
git add src/main/java/lab15/sict/must/edu/mn/Division.java
git commit -m "Resolved merge conflict in Division.java"