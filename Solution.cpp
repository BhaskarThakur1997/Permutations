#include <stdio.h>
 
int main() {
    int n, q;
    scanf("%d %d", &n, &q);
 
    int permutation[n + 1];
    for (int i = 1; i <= n; i++) {
        scanf("%d", &permutation[i]);
    }
 
    int lastOccurrence[n + 1];
    int maxNum = n;
 
    for (int i = n; i >= 1; i--) {
        lastOccurrence[permutation[i]] = i;
    }
 
    for (int i = 0; i < q; i++) {
        int l, r;
        scanf("%d %d", &l, &r);
 
        int maxNotInSubarray = maxNum;
 
        for (int num = maxNotInSubarray; num > 0; num--) {
            if (lastOccurrence[num] > r || lastOccurrence[num] < l) {
                printf("%d\n", num);
                break;
            }
        }
    }
 
    return 0;
}
