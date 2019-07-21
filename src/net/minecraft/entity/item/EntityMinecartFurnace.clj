(ns net.minecraft.entity.item.EntityMinecartFurnace
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.item EntityMinecartFurnace]))

(defn ->entity-minecart-furnace
  "Constructor.

  world-in - `net.minecraft.world.World`
  x - `double`
  y - `double`
  z - `double`"
  (^EntityMinecartFurnace [^net.minecraft.world.World world-in ^Double x ^Double y ^Double z]
    (new EntityMinecartFurnace world-in x y z))
  (^EntityMinecartFurnace [^net.minecraft.world.World world-in]
    (new EntityMinecartFurnace world-in)))

(defn push-x
  "Instance Field.

  type: double"
  (^Double [^EntityMinecartFurnace this]
    (-> this .-pushX)))

(defn push-z
  "Instance Field.

  type: double"
  (^Double [^EntityMinecartFurnace this]
    (-> this .-pushZ)))

(defn *register-fixes-minecart-furnace
  "fixer - `net.minecraft.util.datafix.DataFixer`"
  ([^net.minecraft.util.datafix.DataFixer fixer]
    (EntityMinecartFurnace/registerFixesMinecartFurnace fixer)))

(defn get-type
  "returns: `net.minecraft.entity.item.EntityMinecart$Type`"
  (^net.minecraft.entity.item.EntityMinecart$Type [^EntityMinecartFurnace this]
    (-> this (.getType))))

(defn on-update
  ""
  ([^EntityMinecartFurnace this]
    (-> this (.onUpdate))))

(defn kill-minecart
  "source - `net.minecraft.util.DamageSource`"
  ([^EntityMinecartFurnace this ^net.minecraft.util.DamageSource source]
    (-> this (.killMinecart source))))

(defn process-initial-interact
  "player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`

  returns: `boolean`"
  (^Boolean [^EntityMinecartFurnace this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (-> this (.processInitialInteract player hand))))

(defn get-default-display-tile
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^EntityMinecartFurnace this]
    (-> this (.getDefaultDisplayTile))))

