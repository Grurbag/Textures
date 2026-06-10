// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelRuneSmith1Helmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer horn_r1;
	private final ModelRenderer horn_r2;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;

	public WFMModelRuneSmith1Helmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Head, 0.0F, 3.1416F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 50, -6.0F, -6.0F, -6.0F, 12, 2, 12, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 41, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(1.0F, 0.0F, 6.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, -3.1107F, 0.0308F, -2.3557F);
		Head_r1.cubeList.add(new ModelBox(Head_r1, 52, 61, -2.7071F, -1.2929F, -0.1F, 5, 2, 1, 0.0F, false));

		horn_r1 = new ModelRenderer(this);
		horn_r1.setRotationPoint(-5.3803F, -3.0607F, 9.1118F);
		Head.addChild(horn_r1);
		setRotationAngle(horn_r1, -2.3998F, 0.0F, -1.5708F);
		horn_r1.cubeList.add(new ModelBox(horn_r1, 42, 29, -5.5F, -13.1101F, 7.4315F, 11, 10, 0, 0.0F, false));

		horn_r2 = new ModelRenderer(this);
		horn_r2.setRotationPoint(-5.3803F, -3.0607F, 9.1118F);
		Head.addChild(horn_r2);
		setRotationAngle(horn_r2, -0.829F, 0.0F, -1.5708F);
		horn_r2.cubeList.add(new ModelBox(horn_r2, 42, 29, -5.5F, -5.0F, 0.0F, 11, 10, 0, 0.0F, false));

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(-1.0F, 0.0F, 5.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.0F, -0.7854F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 52, 61, -2.7071F, -1.2929F, -0.1F, 5, 2, 1, 0.0F, false));

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(0.0F, -5.0F, 5.0F);
		Head.addChild(Head_r3);
		setRotationAngle(Head_r3, 0.0F, 0.0F, -0.7854F);
		Head_r3.cubeList.add(new ModelBox(Head_r3, 28, 41, -1.7071F, -1.2929F, -2.1F, 3, 3, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}