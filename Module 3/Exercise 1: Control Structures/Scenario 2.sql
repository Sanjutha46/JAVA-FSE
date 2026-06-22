DECLARE
    CURSOR cust_cursor IS
        SELECT customer_id, balance
        FROM customers;
BEGIN

    FOR cust_rec IN cust_cursor LOOP

        IF cust_rec.balance > 10000 THEN

            UPDATE customers
            SET isVIP = 'TRUE'
            WHERE customer_id = cust_rec.customer_id;

            DBMS_OUTPUT.PUT_LINE(
                'Customer '
                || cust_rec.customer_id
                || ' promoted to VIP'
            );

        END IF;

    END LOOP;

    COMMIT;
END;
/
