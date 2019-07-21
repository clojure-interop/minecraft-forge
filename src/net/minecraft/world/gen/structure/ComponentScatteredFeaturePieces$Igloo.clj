(ns net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Igloo
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure ComponentScatteredFeaturePieces$Igloo]))

(defn ->igloo
  "Constructor.

  rand - `java.util.Random`
  x - `int`
  z - `int`"
  (^ComponentScatteredFeaturePieces$Igloo [^java.util.Random rand ^Integer x ^Integer z]
    (new ComponentScatteredFeaturePieces$Igloo rand x z))
  (^ComponentScatteredFeaturePieces$Igloo []
    (new ComponentScatteredFeaturePieces$Igloo )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^ComponentScatteredFeaturePieces$Igloo this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

