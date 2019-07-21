(ns net.minecraft.entity.item.EntityMinecartChest
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartChest]))

(defn ->entity-minecart-chest
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartChest [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartChest world-in x y z))
  (^EntityMinecartChest [^net.minecraft.world.World world-in]
    (new EntityMinecartChest world-in)))

(defn *register-fixes-minecart-chest
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartChest/registerFixesMinecartChest fixer)))

(defn kill-minecart
  "source - `net.minecraft.util.DamageSource`"
  ([^EntityMinecartChest this ^net.minecraft.util.DamageSource source]
    (-> this (.killMinecart source))))

(defn get-size-inventory
  "returns: `int`"
  (^Integer [^EntityMinecartChest this]
    (-> this (.getSizeInventory))))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartChest this]
    (-> this (.getType))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecartChest this]
    (-> this (.getDefaultDisplayTile))))

(defn get-default-display-tile-offset
  "returns: `int`"
  (^Integer [^EntityMinecartChest this]
    (-> this (.getDefaultDisplayTileOffset))))

(defn get-gui-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EntityMinecartChest this]
    (-> this (.getGuiID))))

(defn create-container
  "player-inventory - `net.minecraft.entity.player.InventoryPlayer`
  player-in - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.inventory.Container`"
  (^net.minecraft.inventory.Container [^EntityMinecartChest this ^net.minecraft.entity.player.InventoryPlayer player-inventory ^net.minecraft.entity.player.EntityPlayer player-in]
    (-> this (.createContainer player-inventory player-in))))

