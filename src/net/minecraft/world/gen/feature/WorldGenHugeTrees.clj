(ns net.minecraft.world.gen.feature.WorldGenHugeTrees
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.feature WorldGenHugeTrees]))

(defn ->world-gen-huge-trees
  "Constructor.

  notify - `boolean`
  base-height-in - `int`
  extra-random-height-in - `int`
  wood-metadata-in - `net.minecraft.block.state.IBlockState`
  leaves-metadata-in - `net.minecraft.block.state.IBlockState`"
  (^WorldGenHugeTrees [^Boolean notify ^Integer base-height-in ^Integer extra-random-height-in ^net.minecraft.block.state.IBlockState wood-metadata-in ^net.minecraft.block.state.IBlockState leaves-metadata-in]
    (new WorldGenHugeTrees notify base-height-in extra-random-height-in wood-metadata-in leaves-metadata-in)))

