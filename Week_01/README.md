学习笔记
# 注意事项
- 刷题不要只做一遍，五毒神掌法，最少做五遍。
- LeetCode 注意feedback，看题解top3的解法，吸收其中思想。
- LeetCode 注意要看国外版的优秀题解。外国的月亮🌛也许比较○。

# 思想
- 升维操作，把一维升级为多维，skiplist  多级索引思想
- 空间换时间
- 夹逼算法，头尾指针从两端逼近
- 快慢指针算法

# 示例代码
## 以下两种for循环写法
```java
for (int i = 0; i < a.length -1; i++) {
    for (int j = i+1; j < a.length; j++) {

    }
}
```
```java
 for(int i=0,j=height.length-1;i<j;) {
            int minH = height[i]< height[j] ? height[i++]:height[j--];
            int area = (j-i+1)*minH;
            max = Math.max(max, area);
}
```
