SELECT machine_id, 
       ROUND(AVG(processing_time), 3) AS processing_time
FROM (
    SELECT a.machine_id, 
           (b.timestamp - a.timestamp) AS processing_time
    FROM Activity a
    JOIN Activity b
        ON a.machine_id = b.machine_id
        AND a.process_id = b.process_id
        AND a.activity_type = 'start'
        AND b.activity_type = 'end'
) AS process_times
GROUP BY machine_id;
