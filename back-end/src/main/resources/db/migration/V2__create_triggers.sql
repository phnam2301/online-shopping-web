-- =====================================================
-- Function auto update column "updated"
-- =====================================================
CREATE OR REPLACE FUNCTION shop.set_updated_timestamp()
RETURNS TRIGGER AS $$
BEGIN
  NEW.updated = now();
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- =====================================================
-- Trigger for Table tags
-- =====================================================
CREATE TRIGGER trg_tags_updated
BEFORE UPDATE ON shop.tags
FOR EACH ROW
EXECUTE FUNCTION shop.set_updated_timestamp();

-- =====================================================
-- Trigger for Table users
-- =====================================================
CREATE TRIGGER trg_users_updated
BEFORE UPDATE ON shop.users
FOR EACH ROW
EXECUTE FUNCTION shop.set_updated_timestamp();

-- =====================================================
-- Trigger for Table products
-- =====================================================
CREATE TRIGGER trg_products_updated
BEFORE UPDATE ON shop.products
FOR EACH ROW
EXECUTE FUNCTION shop.set_updated_timestamp();

-- =====================================================
-- Trigger for Table orders
-- =====================================================
CREATE TRIGGER trg_orders_updated
BEFORE UPDATE ON shop.orders
FOR EACH ROW
EXECUTE FUNCTION shop.set_updated_timestamp();
