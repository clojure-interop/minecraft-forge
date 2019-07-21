(ns net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$JunglePyramid
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure ComponentScatteredFeaturePieces$JunglePyramid]))

(defn ->jungle-pyramid
  "Constructor.

  rand - `java.util.Random`
  x - `int`
  z - `int`"
  (^ComponentScatteredFeaturePieces$JunglePyramid [^java.util.Random rand ^Integer x ^Integer z]
    (new ComponentScatteredFeaturePieces$JunglePyramid rand x z))
  (^ComponentScatteredFeaturePieces$JunglePyramid []
    (new ComponentScatteredFeaturePieces$JunglePyramid )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^ComponentScatteredFeaturePieces$JunglePyramid this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

