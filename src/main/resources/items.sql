CREATE TABLE helloworld.items
(
    item_id bigint NOT NULL DEFAULT nextval('items_id_seq'::regclass),
    item_name character varying(26) COLLATE pg_catalog."default",
    isle integer,
    price double precision,
    category integer,
    CONSTRAINT items_pkey PRIMARY KEY (item_id)
)
