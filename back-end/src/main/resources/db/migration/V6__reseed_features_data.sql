DELETE FROM shop.features;

-- =====================================================
-- Re-Seed default value into table features
-- =====================================================
INSERT INTO shop.features (code, name, url) VALUES
-- Dashboard
('FEATURE_DASHBOARD', 'View Dashboard', '/dashboard'),

-- Setting
('FEATURE_SETTING_LIST', 'View List Settings', '/setting'),
('FEATURE_SETTING_ADD', 'Add Setting', '/setting/add'),
('FEATURE_SETTING_DETAIL', 'View Setting Detail', '/setting/{id}'),
('FEATURE_SETTING_EDIT', 'Eit Setting', '/setting/{id}/edit'),
('FEATURE_SETTING_REMOVE', 'Remove Setting', '/setting/{id}/remove'),

-- User
('FEATURE_USER_LIST', 'View List Users', '/user'),
('FEATURE_USER_ADD', 'Add User', '/user/add'),
('FEATURE_USER_DETAIL', 'View User Detail', '/user/{id}'),
('FEATURE_USER_EDIT', 'Eit User', '/user/{id}/edit'),
('FEATURE_USER_REMOVE', 'Remove User', '/user/{id}/remove'),

-- Product
('FEATURE_PRODUCT_LIST', 'View List Products', '/product'),
('FEATURE_PRODUCT_ADD', 'Add Product', '/product/add'),
('FEATURE_PRODUCT_DETAIL', 'View Product Detail', '/product/{id}'),
('FEATURE_PRODUCT_EDIT', 'Edit Product', '/product/{id}/edit'),
('FEATURE_PRODUCT_REMOVE', 'Remove Product', '/product/{id}/remove'),
('FEATURE_PRODUCT_REVIEW', 'Review Product', '/product/{id}/review'),
('FEATURE_PRODUCT_WISHLIST', 'View Wishlist', '/product/wishlist'),

-- Tag
('FEATURE_TAG_LIST', 'View List Tags', '/tag'),
('FEATURE_TAG_ADD', 'Add Tag', '/tag/add'),
('FEATURE_TAG_DETAIL', 'View Tag Detail', '/tag/{id}'),
('FEATURE_TAG_EDIT', 'Edit Tag', '/tag/{id}/edit'),
('FEATURE_TAG_REMOVE', 'Remove Tag', '/tag/{id}/remove'),

-- Category
('FEATURE_CATEGORY_LIST', 'View List Categories', '/category'),
('FEATURE_CATEGORY_ADD', 'Add Category', '/category/add'),
('FEATURE_CATEGORY_DETAIL', 'View Category Detail', '/category/{id}'),
('FEATURE_CATEGORY_EDIT', 'Edit Category', '/category/{id}/edit'),
('FEATURE_CATEGORY_REMOVE', 'Remove Category', '/category/{id}/remove'),

-- Order
('FEATURE_ORDER_LIST', 'View List Orders', '/order'),
('FEATURE_ORDER_ADD', 'Add Order', '/order/add'),
('FEATURE_ORDER_DETAIL', 'View Order Detail', '/order/{id}'),
('FEATURE_ORDER_EDIT', 'Edit Order', '/order/{id}/edit'),
('FEATURE_ORDER_REMOVE', 'Remove Order', '/order/{id}/remove'),
('FEATURE_ORDER_TRACK', 'Track Order', '/order/{id}/track'),

-- Cart
('FEATURE_CART_VIEW', 'View Cart', '/cart'),
('FEATURE_CART_ADD', 'Add to Cart', '/cart/add/{id}'),
('FEATURE_CHECKOUT', 'Checkout', '/checkout');
