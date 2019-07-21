(ns net.minecraft.block.BlockPressurePlate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPressurePlate]))

(def *-powered
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockPressurePlate/POWERED)

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockPressurePlate this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockPressurePlate this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

