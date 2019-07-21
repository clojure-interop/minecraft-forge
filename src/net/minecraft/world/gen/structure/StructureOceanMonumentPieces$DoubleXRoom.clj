(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$DoubleXRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$DoubleXRoom]))

(defn ->double-x-room
  "Constructor.

  p-i-45597-1 - `net.minecraft.util.EnumFacing`
  p-i-45597-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45597-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$DoubleXRoom [^net.minecraft.util.EnumFacing p-i-45597-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45597-2 ^java.util.Random p-i-45597-3]
    (new StructureOceanMonumentPieces$DoubleXRoom p-i-45597-1 p-i-45597-2 p-i-45597-3))
  (^StructureOceanMonumentPieces$DoubleXRoom []
    (new StructureOceanMonumentPieces$DoubleXRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$DoubleXRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

