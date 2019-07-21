(ns net.minecraft.entity.item.EntityMinecartEmpty
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartEmpty]))

(defn ->entity-minecart-empty
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartEmpty [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartEmpty world-in x y z))
  (^EntityMinecartEmpty [^net.minecraft.world.World world-in]
    (new EntityMinecartEmpty world-in)))

(defn *register-fixes-minecart-empty
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartEmpty/registerFixesMinecartEmpty fixer)))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityMinecartEmpty this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn on-activator-rail-pass
  "x - `int`
  y - `int`
  z - `int`
  receiving-power - `boolean`"
  ([^EntityMinecartEmpty this ^Integer x ^Integer y ^Integer z ^Boolean receiving-power]
    (-> this (.onActivatorRailPass x y z receiving-power))))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartEmpty this]
    (-> this (.getType))))

