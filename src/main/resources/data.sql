MERGE into EMPLOYEE as e using ( select 1 as id, 'Mike', 'Boss') as new on e.id=new.id
    WHEN NOT MATCHED THEN
        INSERT VALUES(1, 'Mike', 'Boss');