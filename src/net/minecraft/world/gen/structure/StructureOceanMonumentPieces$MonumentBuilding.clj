(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$MonumentBuilding
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$MonumentBuilding]))

(defn ->monument-building
  "Constructor.

  p-i-45599-1 - `java.util.Random`
  p-i-45599-2 - `int`
  p-i-45599-3 - `int`
  p-i-45599-4 - `net.minecraft.util.EnumFacing`"
  (^StructureOceanMonumentPieces$MonumentBuilding [^java.util.Random p-i-45599-1 ^Integer p-i-45599-2 ^Integer p-i-45599-3 ^net.minecraft.util.EnumFacing p-i-45599-4]
    (new StructureOceanMonumentPieces$MonumentBuilding p-i-45599-1 p-i-45599-2 p-i-45599-3 p-i-45599-4))
  (^StructureOceanMonumentPieces$MonumentBuilding []
    (new StructureOceanMonumentPieces$MonumentBuilding )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$MonumentBuilding this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

