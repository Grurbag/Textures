// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelBeastmanGorHelmet extends ModelBase {
	private final ModelRenderer headArmour;
	private final ModelRenderer mouthArmour;
	private final ModelRenderer mouth_r1;

	public WFMModelBeastmanGorHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		headArmour = new ModelRenderer(this);
		headArmour.setRotationPoint(0.0F, -2.0F, -1.0F);
		headArmour.cubeList.add(new ModelBox(headArmour, 0, 0, -4.0F, -8.0F, -5.0F, 8, 8, 8, 0.5F, false));

		mouthArmour = new ModelRenderer(this);
		mouthArmour.setRotationPoint(0.0F, 2.4959F, -4.1234F);
		headArmour.addChild(mouthArmour);
		setRotationAngle(mouthArmour, 0.2182F, 0.0F, 0.0F);
		

		mouth_r1 = new ModelRenderer(this);
		mouth_r1.setRotationPoint(-1.0F, 1.0F, -1.0F);
		mouthArmour.addChild(mouth_r1);
		setRotationAngle(mouth_r1, 0.3927F, 0.0F, 0.0F);
		mouth_r1.cubeList.add(new ModelBox(mouth_r1, 0, 25, -2.0F, -10.2766F, -0.7057F, 6, 7, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		headArmour.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}