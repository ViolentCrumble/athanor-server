package au.edu.utscic.athanorserver.data

import scala.collection.immutable.ListMap

/**
  * Created by andrew@andrewresearch.net on 29/6/17.
  */

object RhetoricalTypes {
  type ConstituentTree = List[Serializable]
  type LexicalNodes = ListMap[Int,Node]
  type Dependencies = List[Dependency]
  type ParsedSentence = (LexicalNodes,ConstituentTree,Dependencies)

  case class Node(
                   id:Int,
                   POS:String,
                   surface:Option[String],
                   lemma:Option[String]
                 )

  case class Dependency(
                         name:String,
                         governor:Int,
                         dependent:Int
                       )
}
