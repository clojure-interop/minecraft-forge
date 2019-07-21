(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$MonumentCoreRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$MonumentCoreRoom]))

(defn ->monument-core-room
  "Constructor.

  p-i-45598-1 - `net.minecraft.util.EnumFacing`
  p-i-45598-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45598-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$MonumentCoreRoom [^net.minecraft.util.EnumFacing p-i-45598-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45598-2 ^java.util.Random p-i-45598-3]
    (new StructureOceanMonumentPieces$MonumentCoreRoom p-i-45598-1 p-i-45598-2 p-i-45598-3))
  (^StructureOceanMonumentPieces$MonumentCoreRoom []
    (new StructureOceanMonumentPieces$MonumentCoreRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$MonumentCoreRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

