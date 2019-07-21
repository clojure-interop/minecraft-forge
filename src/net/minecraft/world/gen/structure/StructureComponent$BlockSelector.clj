(ns net.minecraft.world.gen.structure.StructureComponent$BlockSelector
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureComponent$BlockSelector]))

(defn ->block-selector
  "Constructor."
  (^StructureComponent$BlockSelector []
    (new StructureComponent$BlockSelector )))

(defn select-blocks
  "rand - `java.util.Random`
  x - `int`
  y - `int`
  z - `int`
  p-75062-5 - `boolean`"
  ([^StructureComponent$BlockSelector this ^java.util.Random rand ^Integer x ^Integer y ^Integer z ^Boolean p-75062-5]
    (-> this (.selectBlocks rand x y z p-75062-5))))

(defn get-block-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^StructureComponent$BlockSelector this]
    (-> this (.getBlockState))))

