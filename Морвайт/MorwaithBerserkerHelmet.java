// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MorwaithBerserkerHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer mask4_r1;
	private final ModelRenderer mask3_r1;
	private final ModelRenderer mask2_r1;
	private final ModelRenderer mask_r1;
	private final ModelRenderer mask_r2;
	private final ModelRenderer mask_r3;
	private final ModelRenderer tusk_left;
	private final ModelRenderer tusk_right;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer horn3;
	private final ModelRenderer horn3_r1;
	private final ModelRenderer horn4;

	public MorwaithBerserkerHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 1.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -5.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -5.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, -1, 33, -5.0F, -2.0F, -5.0F, 10, 16, 4, 0.0F, false));

		mask4_r1 = new ModelRenderer(this);
		mask4_r1.setRotationPoint(-0.5F, -9.0F, -6.5F);
		Head.addChild(mask4_r1);
		setRotationAngle(mask4_r1, 0.0F, 0.0F, -0.7854F);
		mask4_r1.cubeList.add(new ModelBox(mask4_r1, 27, 25, -3.5F, -4.0F, -0.5F, 8, 8, 1, 0.0F, false));

		mask3_r1 = new ModelRenderer(this);
		mask3_r1.setRotationPoint(4.0F, -8.0F, -5.5F);
		Head.addChild(mask3_r1);
		setRotationAngle(mask3_r1, 0.0F, 0.0F, -0.7854F);
		mask3_r1.cubeList.add(new ModelBox(mask3_r1, 29, 16, -3.0F, -3.0F, -0.5F, 6, 6, 1, 0.0F, false));

		mask2_r1 = new ModelRenderer(this);
		mask2_r1.setRotationPoint(-4.0F, -8.0F, -5.5F);
		Head.addChild(mask2_r1);
		setRotationAngle(mask2_r1, 0.0F, 0.0F, -0.7854F);
		mask2_r1.cubeList.add(new ModelBox(mask2_r1, 29, 16, -3.0F, -3.0F, -0.5F, 6, 6, 1, 0.0F, false));

		mask_r1 = new ModelRenderer(this);
		mask_r1.setRotationPoint(0.0F, 0.5F, -6.5F);
		Head.addChild(mask_r1);
		setRotationAngle(mask_r1, 0.0F, 0.0F, -0.7854F);
		mask_r1.cubeList.add(new ModelBox(mask_r1, 3, 16, -3.5F, -3.5F, -0.5F, 7, 7, 1, 0.0F, false));

		mask_r2 = new ModelRenderer(this);
		mask_r2.setRotationPoint(-4.5F, 0.0F, -5.5F);
		Head.addChild(mask_r2);
		setRotationAngle(mask_r2, 0.0F, 0.0F, -0.7854F);
		mask_r2.cubeList.add(new ModelBox(mask_r2, 4, 25, -2.5F, -3.0F, -0.51F, 6, 6, 1, 0.0F, false));

		mask_r3 = new ModelRenderer(this);
		mask_r3.setRotationPoint(3.5F, 0.0F, -5.5F);
		Head.addChild(mask_r3);
		setRotationAngle(mask_r3, 0.0F, 0.0F, -0.7854F);
		mask_r3.cubeList.add(new ModelBox(mask_r3, 4, 25, -2.5F, -3.0F, -0.51F, 6, 6, 1, 0.0F, false));

		tusk_left = new ModelRenderer(this);
		tusk_left.setRotationPoint(4.0F, 1.0F, -7.0F);
		Head.addChild(tusk_left);
		setRotationAngle(tusk_left, 0.0F, -0.5236F, 0.0F);
		tusk_left.cubeList.add(new ModelBox(tusk_left, 0, 43, 0.0F, -5.0F, -10.0F, 0, 9, 12, 0.0F, false));

		tusk_right = new ModelRenderer(this);
		tusk_right.setRotationPoint(-4.0F, 1.0F, -7.0F);
		Head.addChild(tusk_right);
		setRotationAngle(tusk_right, 0.0F, 0.5236F, 0.0F);
		tusk_right.cubeList.add(new ModelBox(tusk_right, 0, 43, 0.0F, -5.0F, -10.0F, 0, 9, 12, 0.0F, false));

		horn = new ModelRenderer(this);
		horn.setRotationPoint(5.0F, -8.0F, -4.0F);
		Head.addChild(horn);
		setRotationAngle(horn, 0.0F, 0.2182F, 0.0F);
		horn.cubeList.add(new ModelBox(horn, 38, 39, 0.0F, -8.0F, -1.0F, 0, 11, 13, 0.0F, false));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(2.0F, -13.0F, -5.0F);
		Head.addChild(horn2);
		setRotationAngle(horn2, 0.0F, 0.1745F, 0.0F);
		horn2.cubeList.add(new ModelBox(horn2, 38, 39, 0.0F, -7.0F, -1.0F, 0, 11, 13, 0.0F, false));

		horn3 = new ModelRenderer(this);
		horn3.setRotationPoint(-3.0F, -12.0F, -5.0F);
		Head.addChild(horn3);
		setRotationAngle(horn3, 0.0F, 0.0436F, 0.0F);
		

		horn3_r1 = new ModelRenderer(this);
		horn3_r1.setRotationPoint(1.0F, 0.0F, 0.0F);
		horn3.addChild(horn3_r1);
		setRotationAngle(horn3_r1, 0.0F, -0.2182F, 0.0F);
		horn3_r1.cubeList.add(new ModelBox(horn3_r1, 38, 39, 0.0F, -7.0F, -1.0F, 0, 11, 13, 0.0F, false));

		horn4 = new ModelRenderer(this);
		horn4.setRotationPoint(-5.0F, -7.0F, -4.0F);
		Head.addChild(horn4);
		setRotationAngle(horn4, 0.0F, -0.2182F, 0.0F);
		horn4.cubeList.add(new ModelBox(horn4, 38, 39, 0.0F, -8.0F, -1.0F, 0, 11, 13, 0.0F, false));
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