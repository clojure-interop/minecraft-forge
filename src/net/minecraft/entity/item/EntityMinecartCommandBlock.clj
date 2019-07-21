(ns net.minecraft.entity.item.EntityMinecartCommandBlock
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartCommandBlock]))

(defn ->entity-minecart-command-block
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartCommandBlock [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartCommandBlock world-in x y z))
  (^EntityMinecartCommandBlock [^net.minecraft.world.World world-in]
    (new EntityMinecartCommandBlock world-in)))

(defn *register-fixes-minecart-command
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartCommandBlock/registerFixesMinecartCommand fixer)))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartCommandBlock this]
    (-> this (.getType))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecartCommandBlock this]
    (-> this (.getDefaultDisplayTile))))

(defn get-command-block-logic
  "returns: `net.minecraft.tileentity.CommandBlockBaseLogic`"
  (^net.minecraft.tileentity.CommandBlockBaseLogic [^EntityMinecartCommandBlock this]
    (-> this (.getCommandBlockLogic))))

(defn on-activator-rail-pass
  "x - `int`
  y - `int`
  z - `int`
  receiving-power - `boolean`"
  ([^EntityMinecartCommandBlock this ^Integer x ^Integer y ^Integer z ^Boolean receiving-power]
    (-> this (.onActivatorRailPass x y z receiving-power))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityMinecartCommandBlock this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn notify-data-manager-change
  "key - `net.minecraft.network.datasync.DataParameter`"
  ([^EntityMinecartCommandBlock this ^net.minecraft.network.datasync.DataParameter key]
    (-> this (.notifyDataManagerChange key))))

(defn ignore-item-entity-data
  "returns: `boolean`"
  (^Boolean [^EntityMinecartCommandBlock this]
    (-> this (.ignoreItemEntityData))))

