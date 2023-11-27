# CS-II-Project
 
I was tasked to complete a set of queries for a project in my Data Structures course. The goal of this asisngment was to gain experience in using sets and maps to efficiently answer queries on a large dataset.

**About the Assignment**

The dataset I worked with contains records of airline flights in the US for the years 1990, 2005, and 2020. Each record contains the origin and destination airports, month, airport ID, etc.

The assignment invovled implementing 10 different queries on this dataset, such as:
- Number of flights from a certain airport
- Distinct destinations reachable from an airport
- Month with the most flights
- States with the most flights between them
- Percentage of intra-state flights per state
- Finding multi-hop flight routes between two airports

**My Solution**

To answer the queries, I implemented solutions using TreeSets, HashSets, TreeMaps and HashMaps. By using these data structures, I was able to construct queries that could be performed in O(n) time instead of O(n^2).

The most complex query involved finding multi-hop routes between two airports. I experimented with designing various algorithms such as nested loops, using Maps, and sorting/merging Maps. In the end, I settled on the Map-based algorithm to provide the best balance of performance and code simplicity.

In completing this assignment, I learned how to use data structures and algorithms to efficiently process and query large datasets.
