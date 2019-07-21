(ns net.minecraft.block.BlockRailPowered
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockRailPowered]))

(def *-shape
  "Static Constant.

  type: net.minecraft.block.properties.PropertyEnum<net.minecraft.block.BlockRailBase$EnumRailDirection>"
  BlockRailPowered/SHAPE)

(def *-powered
  "Static Constant.

  type: net.minecraft.block.properties.PropertyBool"
  BlockRailPowered/POWERED)

(defn get-shape-property
  "returns: `net.minecraft.block.properties.IProperty<net.minecraft.block.BlockRailBase$EnumRailDirection>`"
  (^net.minecraft.block.properties.IProperty [^BlockRailPowered this]
    (-> this (.getShapeProperty))))

(defn get-state-from-meta
  "meta - `int`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRailPowered this ^Integer meta]
    (-> this (.getStateFromMeta meta))))

(defn get-meta-from-state
  "state - `net.minecraft.block.state.IBlockState`

  returns: `int`"
  (^Integer [^BlockRailPowered this ^net.minecraft.block.state.IBlockState state]
    (-> this (.getMetaFromState state))))

(defn with-rotation
  "state - `net.minecraft.block.state.IBlockState`
  rot - `net.minecraft.util.Rotation`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRailPowered this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Rotation rot]
    (-> this (.withRotation state rot))))

(defn with-mirror
  "state - `net.minecraft.block.state.IBlockState`
  mirror-in - `net.minecraft.util.Mirror`

  returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockRailPowered this ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.Mirror mirror-in]
    (-> this (.withMirror state mirror-in))))

