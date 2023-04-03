Write the following static methods in `StringListSearch.java`, and corresponding unit tests in `StringListSearchTest.java`. Make sure your unit tests include search misses as well as search hits. And include search hits that occur at the very start or end of the collections.

Each of these are static methods that take as input an `ArrayList` of strings and a search string. They return an integer indicating the first index the search string appears as an element in the `ArrayList`. If the search string never appears as an element in the `ArrayList`, -1 is returned.

For example, if the `ArrayList` used is:

`["there", "is", "the", "mountain"]`

Using "the" as the search string should return 2.
Using "mountain" as the search string should return 3.
Using "valley" as the search string should return -1.

The code I wrote in the presentation used arrays instead of `ArrayList`s. So you will have to use `.get(0)` instead of `[0]`. I used integers instead of strings, so I used `<` and `>` to compare elements. You will have to use the `.compareTo` method to compare two strings alphabetically (documentation available on the quick reference)

I recommend attempting to write these methods / algorithms from scratch before consulting the presentation code, or other online resources for guidance.

1. `unorderedSearch`

    In this method, the input `ArrayList` isn't necessarily sorted.

2. `orderedLinearSearch`

    In this method, the input `ArrayList` is sorted. Use a linear search algorithm.
    

3. `orderedBinarySearch`

    In this method, the input `ArrayList` is sorted. Use the binary search algorithm.
