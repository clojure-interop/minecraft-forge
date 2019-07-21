(ns net.minecraft.entity.item.EntityMinecart
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecart]))

(defn ->entity-minecart
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecart [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecart world-in x y z))
  (^EntityMinecart [^net.minecraft.world.World world-in]
    (new EntityMinecart world-in)))

(defn *-default-max-speed-air-lateral
  "Static Field.

  type: float"
  []
  EntityMinecart/defaultMaxSpeedAirLateral)

(defn *-default-max-speed-air-vertical
  "Static Field.

  type: float"
  []
  EntityMinecart/defaultMaxSpeedAirVertical)

(defn *-default-drag-air
  "Static Field.

  type: double"
  []
  EntityMinecart/defaultDragAir)

(defn *create
  "world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`
  type-in - `net.minecraft.entity.item.EntityMinecart$Type`

  returns: `net.minecraft.entity.item.EntityMinecart`"
  (^net.minecraft.entity.item.EntityMinecart [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z ^net.minecraft.entity.item.EntityMinecart$Type type-in]
    (EntityMinecart/create world-in x y z type-in)))

(defn *register-fixes-minecart
  "fixer - `net.minecraft.util.datafix.DataFixer`
  name - `java.lang.Class`"
  ([^net.minecraft.util.datafix.DataFixer fixer ^java.lang.Class name]
    (EntityMinecart/registerFixesMinecart fixer name)))

(defn *get-collision-handler
  "Gets the current global Minecart Collision handler if none
   is registered, returns null

  returns: The collision handler or null - `net.minecraftforge.common.IMinecartCollisionHandler`"
  (^net.minecraftforge.common.IMinecartCollisionHandler []
    (EntityMinecart/getCollisionHandler )))

(defn *set-collision-handler
  "Sets the global Minecart Collision handler, overwrites any
   that is currently set.

  handler - The new handler - `net.minecraftforge.common.IMinecartCollisionHandler`"
  ([^net.minecraftforge.common.IMinecartCollisionHandler handler]
    (EntityMinecart/setCollisionHandler handler)))

(defn get-display-tile-offset
  "returns: `int`"
  (^Integer [^EntityMinecart this]
    (-> this (.getDisplayTileOffset))))

(defn get-adjusted-horizontal-facing
  "returns: `net.minecraft.util.EnumFacing`"
  (^net.minecraft.util.EnumFacing [^EntityMinecart this]
    (-> this (.getAdjustedHorizontalFacing))))

(defn set-position-and-rotation-direct
  "x - `double`
  y - `double`
  z - `double`
  yaw - `float`
  pitch - `float`
  pos-rotation-increments - `int`
  teleport - `boolean`"
  ([^EntityMinecart this ^Double x ^Double y ^Double z ^Float yaw ^Float pitch ^Integer pos-rotation-increments ^Boolean teleport]
    (-> this (.setPositionAndRotationDirect x y z yaw pitch pos-rotation-increments teleport))))

(defn set-display-tile
  "display-tile - `net.minecraft.block.state.IBlockState`"
  ([^EntityMinecart this ^net.minecraft.block.state.IBlockState display-tile]
    (-> this (.setDisplayTile display-tile))))

(defn set-rolling-direction
  "rolling-direction - `int`"
  ([^EntityMinecart this ^Integer rolling-direction]
    (-> this (.setRollingDirection rolling-direction))))

(defn get-comparator-level
  "Called from Detector Rails to retrieve a redstone power level for comparators.

  returns: `int`"
  (^Integer [^EntityMinecart this]
    (-> this (.getComparatorLevel))))

(defn get-max-cart-speed-on-rail
  "Returns the carts max speed when traveling on rails. Carts going faster
   than 1.1 cause issues with chunk loading. Carts cant traverse slopes or
   corners at greater than 0.5 - 0.6. This value is compared with the rails
   max speed and the carts current speed cap to determine the carts current
   max speed. A normal rail's max speed is 0.4.

  returns: Carts max speed. - `float`"
  (^Float [^EntityMinecart this]
    (-> this (.getMaxCartSpeedOnRail))))

(defn set-drag-air
  "value - `double`"
  ([^EntityMinecart this ^Double value]
    (-> this (.setDragAir value))))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecart this]
    (-> this (.getType))))

(defn set-position
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityMinecart this ^Double x ^Double y ^Double z]
    (-> this (.setPosition x y z))))

(defn set-max-speed-air-vertical
  "value - `float`"
  ([^EntityMinecart this ^Float value]
    (-> this (.setMaxSpeedAirVertical value))))

(defn get-drag-air
  "returns: `double`"
  (^Double [^EntityMinecart this]
    (-> this (.getDragAir))))

(defn on-update
  ""
  ([^EntityMinecart this]
    (-> this (.onUpdate))))

(defn get-rolling-direction
  "returns: `int`"
  (^Integer [^EntityMinecart this]
    (-> this (.getRollingDirection))))

(defn get-max-speed-air-vertical
  "returns: `float`"
  (^Float [^EntityMinecart this]
    (-> this (.getMaxSpeedAirVertical))))

(defn set-display-tile-offset
  "display-tile-offset - `int`"
  ([^EntityMinecart this ^Integer display-tile-offset]
    (-> this (.setDisplayTileOffset display-tile-offset))))

(defn can-use-rail?
  "Returns true if this cart can currently use rails.
   This function is mainly used to gracefully detach a minecart from a rail.

  returns: True if the minecart can use rails. - `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.canUseRail))))

(defn set-has-display-tile
  "show-block - `boolean`"
  ([^EntityMinecart this ^Boolean show-block]
    (-> this (.setHasDisplayTile show-block))))

(defn set-rolling-amplitude
  "rolling-amplitude - `int`"
  ([^EntityMinecart this ^Integer rolling-amplitude]
    (-> this (.setRollingAmplitude rolling-amplitude))))

(defn apply-entity-collision
  "entity-in - `net.minecraft.entity.Entity`"
  ([^EntityMinecart this ^net.minecraft.entity.Entity entity-in]
    (-> this (.applyEntityCollision entity-in))))

(defn get-damage
  "returns: `float`"
  (^Float [^EntityMinecart this]
    (-> this (.getDamage))))

(defn set-current-cart-speed-cap-on-rail
  "value - `float`"
  ([^EntityMinecart this ^Float value]
    (-> this (.setCurrentCartSpeedCapOnRail value))))

(defn kill-minecart
  "source - `net.minecraft.util.DamageSource`"
  ([^EntityMinecart this ^net.minecraft.util.DamageSource source]
    (-> this (.killMinecart source))))

(defn can-be-ridden?
  "Returns true if this cart can be ridden by an Entity.

  returns: True if this cart can be ridden. - `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.canBeRidden))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecart this]
    (-> this (.getDefaultDisplayTile))))

(defn get-default-display-tile-offset
  "returns: `int`"
  (^Integer [^EntityMinecart this]
    (-> this (.getDefaultDisplayTileOffset))))

(defn has-display-tile?
  "returns: `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.hasDisplayTile))))

(defn get-current-cart-speed-cap-on-rail
  "Returns the current speed cap for the cart when traveling on rails. This
   functions differs from getMaxCartSpeedOnRail() in that it controls
   current movement and cannot be overridden. The value however can never be
   higher than getMaxCartSpeedOnRail().

  returns: `float`"
  (^Float [^EntityMinecart this]
    (-> this (.getCurrentCartSpeedCapOnRail))))

(defn move-minecart-on-rail
  "Moved to allow overrides.
   This code handles minecart movement and speed capping when on a rail.

  pos - `net.minecraft.util.math.BlockPos`"
  ([^EntityMinecart this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.moveMinecartOnRail pos))))

(defn attack-entity-from
  "source - `net.minecraft.util.DamageSource`
  amount - `float`

  returns: `boolean`"
  (^Boolean [^EntityMinecart this ^net.minecraft.util.DamageSource source ^Float amount]
    (-> this (.attackEntityFrom source amount))))

(defn powered-cart?
  "Returns true if this cart is self propelled.

  returns: True if powered. - `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.isPoweredCart))))

(defn on-activator-rail-pass
  "x - `int`
  y - `int`
  z - `int`
  receiving-power - `boolean`"
  ([^EntityMinecart this ^Integer x ^Integer y ^Integer z ^Boolean receiving-power]
    (-> this (.onActivatorRailPass x y z receiving-power))))

(defn get-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecart this]
    (-> this (.getDisplayTile))))

(defn can-be-collided-with?
  "returns: `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.canBeCollidedWith))))

(defn get-max-speed-air-lateral
  "returns: `float`"
  (^Float [^EntityMinecart this]
    (-> this (.getMaxSpeedAirLateral))))

(defn get-pos-offset
  "x - `double`
  y - `double`
  z - `double`
  offset - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityMinecart this ^Double x ^Double y ^Double z ^Double offset]
    (-> this (.getPosOffset x y z offset))))

(defn perform-hurt-animation
  ""
  ([^EntityMinecart this]
    (-> this (.performHurtAnimation))))

(defn get-pos
  "p-70489-1 - `double`
  p-70489-3 - `double`
  p-70489-5 - `double`

  returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^EntityMinecart this ^Double p-70489-1 ^Double p-70489-3 ^Double p-70489-5]
    (-> this (.getPos p-70489-1 p-70489-3 p-70489-5))))

(defn get-collision-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^EntityMinecart this]
    (-> this (.getCollisionBoundingBox))))

(defn set-max-speed-air-lateral
  "value - `float`"
  ([^EntityMinecart this ^Float value]
    (-> this (.setMaxSpeedAirLateral value))))

(defn get-collision-box
  "entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^EntityMinecart this ^net.minecraft.entity.Entity entity-in]
    (-> this (.getCollisionBox entity-in))))

(defn get-rolling-amplitude
  "returns: `int`"
  (^Integer [^EntityMinecart this]
    (-> this (.getRollingAmplitude))))

(defn get-mounted-y-offset
  "returns: `double`"
  (^Double [^EntityMinecart this]
    (-> this (.getMountedYOffset))))

(defn get-cart-item
  "This function returns an ItemStack that represents this cart.
   This should be an ItemStack that can be used by the player to place the cart,
   but is not necessary the item the cart drops when destroyed.

  returns: An ItemStack that can be used to place the cart. - `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^EntityMinecart this]
    (-> this (.getCartItem))))

(defn can-be-pushed?
  "returns: `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.canBePushed))))

(defn set-can-use-rail
  "Set whether the minecart can use rails.
   This function is mainly used to gracefully detach a minecart from a rail.

  use - Whether the minecart can currently use rails. - `boolean`"
  ([^EntityMinecart this ^Boolean use]
    (-> this (.setCanUseRail use))))

(defn should-do-rail-functions?
  "Return false if this cart should not call onMinecartPass() and should ignore Powered Rails.

  returns: True if this cart should call onMinecartPass(). - `boolean`"
  (^Boolean [^EntityMinecart this]
    (-> this (.shouldDoRailFunctions))))

(defn get-slope-adjustment
  "returns: `double`"
  (^Double [^EntityMinecart this]
    (-> this (.getSlopeAdjustment))))

(defn get-render-bounding-box
  "returns: `net.minecraft.util.math.AxisAlignedBB`"
  (^net.minecraft.util.math.AxisAlignedBB [^EntityMinecart this]
    (-> this (.getRenderBoundingBox))))

(defn set-damage
  "damage - `float`"
  ([^EntityMinecart this ^Float damage]
    (-> this (.setDamage damage))))

(defn set-velocity
  "x - `double`
  y - `double`
  z - `double`"
  ([^EntityMinecart this ^Double x ^Double y ^Double z]
    (-> this (.setVelocity x y z))))

