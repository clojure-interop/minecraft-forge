(ns net.minecraft.util.text.TextComponentUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util.text TextComponentUtils]))

(defn ->text-component-utils
  "Constructor."
  (^TextComponentUtils []
    (new TextComponentUtils )))

(defn *process-component
  "command-sender - `net.minecraft.command.ICommandSender`
  component - `net.minecraft.util.text.ITextComponent`
  entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.text.ITextComponent`

  throws: net.minecraft.command.CommandException"
  (^net.minecraft.util.text.ITextComponent [^net.minecraft.command.ICommandSender command-sender ^net.minecraft.util.text.ITextComponent component ^net.minecraft.entity.Entity entity-in]
    (TextComponentUtils/processComponent command-sender component entity-in)))

