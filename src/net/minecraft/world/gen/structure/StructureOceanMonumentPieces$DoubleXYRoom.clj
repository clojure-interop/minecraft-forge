(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$DoubleXYRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$DoubleXYRoom]))

(defn ->double-xy-room
  "Constructor.

  p-i-45596-1 - `net.minecraft.util.EnumFacing`
  p-i-45596-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45596-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$DoubleXYRoom [^net.minecraft.util.EnumFacing p-i-45596-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45596-2 ^java.util.Random p-i-45596-3]
    (new StructureOceanMonumentPieces$DoubleXYRoom p-i-45596-1 p-i-45596-2 p-i-45596-3))
  (^StructureOceanMonumentPieces$DoubleXYRoom []
    (new StructureOceanMonumentPieces$DoubleXYRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$DoubleXYRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

