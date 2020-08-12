SELECT W1.Id 
FROM WEATHER W1,WEATHER W2 
WHERE DATEDIFF(W1.RecordDate, W2.RecordDate)=1 AND
(W1.Temperature  > W2.Temperature )