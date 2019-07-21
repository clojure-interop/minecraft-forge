(ns net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure ComponentScatteredFeaturePieces$DesertPyramid]))

(defn ->desert-pyramid
  "Constructor.

  p-i-2062-1 - `java.util.Random`
  p-i-2062-2 - `int`
  p-i-2062-3 - `int`"
  (^ComponentScatteredFeaturePieces$DesertPyramid [^java.util.Random p-i-2062-1 ^Integer p-i-2062-2 ^Integer p-i-2062-3]
    (new ComponentScatteredFeaturePieces$DesertPyramid p-i-2062-1 p-i-2062-2 p-i-2062-3))
  (^ComponentScatteredFeaturePieces$DesertPyramid []
    (new ComponentScatteredFeaturePieces$DesertPyramid )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^ComponentScatteredFeaturePieces$DesertPyramid this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

