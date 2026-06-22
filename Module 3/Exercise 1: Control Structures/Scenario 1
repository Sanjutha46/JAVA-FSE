DECLARE
    CURSOR cust_cursor IS
        SELECT c.customer_id, c.age, l.loan_id, l.interest_rate
        FROM customers c
        JOIN loans l ON c.customer_id = l.customer_id;
BEGIN
    FOR cust_rec IN cust_cursor LOOP

        IF cust_rec.age > 60 THEN

            UPDATE loans
            SET interest_rate = interest_rate - 1
            WHERE loan_id = cust_rec.loan_id;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Loan ID: '
                || cust_rec.loan_id
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/
