(ns net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$SwampHut
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure ComponentScatteredFeaturePieces$SwampHut]))

(defn ->swamp-hut
  "Constructor.

  p-i-2066-1 - `java.util.Random`
  p-i-2066-2 - `int`
  p-i-2066-3 - `int`"
  (^ComponentScatteredFeaturePieces$SwampHut [^java.util.Random p-i-2066-1 ^Integer p-i-2066-2 ^Integer p-i-2066-3]
    (new ComponentScatteredFeaturePieces$SwampHut p-i-2066-1 p-i-2066-2 p-i-2066-3))
  (^ComponentScatteredFeaturePieces$SwampHut []
    (new ComponentScatteredFeaturePieces$SwampHut )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^ComponentScatteredFeaturePieces$SwampHut this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

