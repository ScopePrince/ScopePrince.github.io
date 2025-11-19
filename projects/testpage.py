import streamlit as st

st.title(":rainbow[Hello Streamlit-er] 👋")
st.markdown(
    """ 
    This is a playground for you to try Streamlit and have fun. 

    **There's :rainbow[so much] you can build!**
    
   :rainbow[ We prepared a few examples for you to get started. Just 
    click on the buttons above and discover what you can do 
    with Streamlit.]
    """
)

if st.button(":rainbow[Send balloons!]"):
    for repeat in range(20):
        st.balloons()
