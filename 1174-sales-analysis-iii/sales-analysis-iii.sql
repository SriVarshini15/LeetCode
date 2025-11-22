/* -- Write your PostgreSQL query statement below
SELECT p.product_id, p.product_name
FROM Product as p LEFT JOIN Sales AS s
ON p.product_id=s.product_id
WHERE s.sale_date BETWEEN '2019-01-01' AND '2019-03-31'; */
SELECT p.product_id, p.product_name
FROM Product AS p
WHERE EXISTS (
    SELECT 1
    FROM Sales AS s
    WHERE s.product_id = p.product_id
      AND s.sale_date BETWEEN '2019-01-01' AND '2019-03-31'
)
AND NOT EXISTS (
    SELECT 1
    FROM Sales AS s
    WHERE s.product_id = p.product_id
      AND (s.sale_date < '2019-01-01' OR s.sale_date > '2019-03-31')
);
