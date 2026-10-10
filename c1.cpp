
#include <stdio.h>

int main()
{
    int n, pos, val;

    printf("Enter your total number of integers: ");
    scanf("%d", &n);

    int arr[n + 1];

    printf("Enter the integers:\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Enter the position to insert: ");
    scanf("%d", &pos);

    printf("Enter the element to insert: ");
    scanf("%d", &val);

    // Shift elements to the right
    for (int i = n; i >= pos; i--)
    {
        arr[i] = arr[i - 1];
    }

    // Insert the element
    arr[pos - 1] = val;
    n++;

    // Print the updated array
    printf("Updated array: ");
    for (int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    return 0;
}
