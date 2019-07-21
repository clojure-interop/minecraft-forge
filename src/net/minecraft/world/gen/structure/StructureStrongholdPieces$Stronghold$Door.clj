(ns net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureStrongholdPieces$Stronghold$Door]))

(def OPENING
  "Enum Constant.

  type: net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door"
  StructureStrongholdPieces$Stronghold$Door/OPENING)

(def WOOD_DOOR
  "Enum Constant.

  type: net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door"
  StructureStrongholdPieces$Stronghold$Door/WOOD_DOOR)

(def GRATES
  "Enum Constant.

  type: net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door"
  StructureStrongholdPieces$Stronghold$Door/GRATES)

(def IRON_DOOR
  "Enum Constant.

  type: net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door"
  StructureStrongholdPieces$Stronghold$Door/IRON_DOOR)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StructureStrongholdPieces.Stronghold.Door c : StructureStrongholdPieces.Stronghold.Door.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door[]`"
  ([]
    (StructureStrongholdPieces$Stronghold$Door/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.world.gen.structure.StructureStrongholdPieces$Stronghold$Door [^java.lang.String name]
    (StructureStrongholdPieces$Stronghold$Door/valueOf name)))

