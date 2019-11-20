package com.cgo.common.respones;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class Result<T> {

    private List<T> data;
    private int length;


}
