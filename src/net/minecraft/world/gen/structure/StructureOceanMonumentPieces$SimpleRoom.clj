(ns net.minecraft.world.gen.structure.StructureOceanMonumentPieces$SimpleRoom
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureOceanMonumentPieces$SimpleRoom]))

(defn ->simple-room
  "Constructor.

  p-i-45587-1 - `net.minecraft.util.EnumFacing`
  p-i-45587-2 - `net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition`
  p-i-45587-3 - `java.util.Random`"
  (^StructureOceanMonumentPieces$SimpleRoom [^net.minecraft.util.EnumFacing p-i-45587-1 ^net.minecraft.world.gen.structure.StructureOceanMonumentPieces.RoomDefinition p-i-45587-2 ^java.util.Random p-i-45587-3]
    (new StructureOceanMonumentPieces$SimpleRoom p-i-45587-1 p-i-45587-2 p-i-45587-3))
  (^StructureOceanMonumentPieces$SimpleRoom []
    (new StructureOceanMonumentPieces$SimpleRoom )))

(defn add-component-parts
  "world-in - `net.minecraft.world.World`
  random-in - `java.util.Random`
  structure-bounding-box-in - `net.minecraft.world.gen.structure.StructureBoundingBox`

  returns: `boolean`"
  (^Boolean [^StructureOceanMonumentPieces$SimpleRoom this ^net.minecraft.world.World world-in ^java.util.Random random-in ^net.minecraft.world.gen.structure.StructureBoundingBox structure-bounding-box-in]
    (-> this (.addComponentParts world-in random-in structure-bounding-box-in))))

