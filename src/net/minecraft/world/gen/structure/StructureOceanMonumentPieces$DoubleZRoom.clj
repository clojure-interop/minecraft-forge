(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$DoubleZRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$DoubleZRoom]))

(defn ->double-z-room
  "Constructor.

  p-i-45593-1 - `net.minecraft.util.EnumFacing`
  p-i-45593-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45593-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$DoubleZRoom [^net.minecraft.util.EnumFacing p-i-45593-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45593-2 ^java.util.Random p-i-45593-3]
    (new StructureOceanMonumentPieces$DoubleZRoom p-i-45593-1 p-i-45593-2 p-i-45593-3))
  (^StructureOceanMonumentPieces$DoubleZRoom []
    (new StructureOceanMonumentPieces$DoubleZRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$DoubleZRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

