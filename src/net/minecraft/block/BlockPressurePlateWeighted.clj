(ns net.minecraft.block.BlockPressurePlateWeighted
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPressurePlateWeighted]))

(def *-power
  "Static Constant.

  type: net.minecraft.block.properties.PropertyInteger"
  BlockPressurePlateWeighted/POWER)

(defn tick-rate
  "world-in - `net.minecraft.world.World`

  returns: `int`"
  (^Integer [^BlockPressurePlateWeighted this ^net.minecraft.world.World world-in]
    (-> this (.tickRate world-in))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPressurePlateWeighted this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPressurePlateWeighted this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

