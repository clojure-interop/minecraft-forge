(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$DoubleYRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$DoubleYRoom]))

(defn ->double-y-room
  "Constructor.

  p-i-45595-1 - `net.minecraft.util.EnumFacing`
  p-i-45595-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45595-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$DoubleYRoom [^net.minecraft.util.EnumFacing p-i-45595-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45595-2 ^java.util.Random p-i-45595-3]
    (new StructureOceanMonumentPieces$DoubleYRoom p-i-45595-1 p-i-45595-2 p-i-45595-3))
  (^StructureOceanMonumentPieces$DoubleYRoom []
    (new StructureOceanMonumentPieces$DoubleYRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$DoubleYRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

