(ns net.minecraft.entity.item.EntityMinecartHopper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartHopper]))

(defn ->entity-minecart-hopper
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartHopper [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartHopper world-in x y z))
  (^EntityMinecartHopper [^net.minecraft.world.World world-in]
    (new EntityMinecartHopper world-in)))

(defn *register-fixes-minecart-hopper
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartHopper/registerFixesMinecartHopper fixer)))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^EntityMinecartHopper this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

(defn capture-dropped-items
  "returns: `boolean`"
  (^Boolean [^EntityMinecartHopper this]
    (-> this (.captureDroppedItems))))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartHopper this]
    (-> this (.getType))))

(defn on-update
  ""
  ([^EntityMinecartHopper this]
    (-> this (.onUpdate))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityMinecartHopper this]
    (-> this (.getGuiID))))

(defn set-transfer-ticker
  "p-98042-1 - `int`"
  ([^EntityMinecartHopper this ^Integer p-98042-1]
    (-> this (.setTransferTicker p-98042-1))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityMinecartHopper this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn kill-minecart
  "source - `net.minecraft.util.DamageSource`"
  ([^EntityMinecartHopper this ^net.minecraft.util.DamageSource source]
    (-> this (.killMinecart source))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecartHopper this]
    (-> this (.getDefaultDisplayTile))))

(defn get-y-pos
  "returns: `double`"
  (^Double [^EntityMinecartHopper this]
    (-> this (.getYPos))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^EntityMinecartHopper this]
    (-> this (.getWorld))))

(defn get-default-display-tile-offset
  "returns: `int`"
  (^Integer [^EntityMinecartHopper this]
    (-> this (.getDefaultDisplayTileOffset))))

(defn get-blocked?
  "returns: `boolean`"
  (^Boolean [^EntityMinecartHopper this]
    (-> this (.getBlocked))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^EntityMinecartHopper this]
    (-> this (.getSizeInventory))))

(defn set-blocked
  "p-96110-1 - `boolean`"
  ([^EntityMinecartHopper this ^Boolean p-96110-1]
    (-> this (.setBlocked p-96110-1))))

(defn on-activator-rail-pass
  "x - `int`
  y - `int`
  z - `int`
  receiving-power - `boolean`"
  ([^EntityMinecartHopper this ^Integer x ^Integer y ^Integer z ^Boolean receiving-power]
    (-> this (.onActivatorRailPass x y z receiving-power))))

(defn get-x-pos
  "returns: `double`"
  (^Double [^EntityMinecartHopper this]
    (-> this (.getXPos))))

(defn get-z-pos
  "returns: `double`"
  (^Double [^EntityMinecartHopper this]
    (-> this (.getZPos))))

(defn can-transfer?
  "returns: `boolean`"
  (^Boolean [^EntityMinecartHopper this]
    (-> this (.canTransfer))))

