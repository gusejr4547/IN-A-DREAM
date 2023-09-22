import React from "react";
import S from "styled-components";

interface ButtonProps {
  children?: React.ReactNode;
}

const StyledDateButton = S.div<ButtonProps>`
height:6vh;
width:12vw;
color:#BCBCBC;

border-radius:5px;
background-color: #0F006A;
display:flex;
justify-content: center;
align-items: center;
font-size: 1.6vw;
text-shadow: 1px 1px 1px black;

`;

const DateBox = (props: ButtonProps) => {
  return <StyledDateButton {...props}>{props.children}</StyledDateButton>;
};

export default DateBox;