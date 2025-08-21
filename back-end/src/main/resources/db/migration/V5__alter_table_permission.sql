ALTER TABLE shop.permission
DROP CONSTRAINT permission_feature_fkey;

ALTER TABLE shop.permission
DROP CONSTRAINT permission_role_fkey;

ALTER TABLE shop.permission
DROP COLUMN feature;

ALTER TABLE shop.permission
ADD CONSTRAINT permission_role_fkey FOREIGN KEY (role) REFERENCES shop.tags(id) ON DELETE CASCADE;

ALTER TABLE shop.permission
ADD COLUMN feature_id BIGINT REFERENCES shop.features(id) ON DELETE CASCADE;
