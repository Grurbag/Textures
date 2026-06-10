// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelReiksguardHelmet extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer feather_r1;
	private final ModelRenderer feather_r2;
	private final ModelRenderer feather_r3;
	private final ModelRenderer feather_r4;
	private final ModelRenderer head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer venok;
	private final ModelRenderer venok_r1;
	private final ModelRenderer venok_r2;
	private final ModelRenderer venok_r3;
	private final ModelRenderer lenta;
	private final ModelRenderer lenta_r1;
	private final ModelRenderer lenta2;
	private final ModelRenderer lenta2_r1;
	private final ModelRenderer lenta3;
	private final ModelRenderer lenta3_r1;

	public WFMModelReiksguardHelmet() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 9, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 24, -4.0F, -10.0F, -4.0F, 8, 2, 8, 0.1F, false));
		Head.cubeList.add(new ModelBox(Head, 44, 54, -2.5F, -13.5F, -6.0F, 5, 5, 5, -0.8F, false));
		Head.cubeList.add(new ModelBox(Head, 36, 20, 0.0F, -22.0F, -3.0F, 0, 11, 14, 0.0F, false));

		feather_r1 = new ModelRenderer(this);
		feather_r1.setRotationPoint(0.0F, -7.0F, -3.0F);
		Head.addChild(feather_r1);
		setRotationAngle(feather_r1, 0.0F, 0.5672F, 0.0F);
		feather_r1.cubeList.add(new ModelBox(feather_r1, 0, 39, 0.0F, -11.0F, 0.0F, 0, 11, 14, 0.0F, false));

		feather_r2 = new ModelRenderer(this);
		feather_r2.setRotationPoint(0.0F, -10.0F, -3.0F);
		Head.addChild(feather_r2);
		setRotationAngle(feather_r2, 0.0F, 0.3054F, 0.0F);
		feather_r2.cubeList.add(new ModelBox(feather_r2, 0, 39, 0.0F, -11.0F, 0.0F, 0, 11, 14, 0.0F, false));

		feather_r3 = new ModelRenderer(this);
		feather_r3.setRotationPoint(0.0F, -10.0F, -3.0F);
		Head.addChild(feather_r3);
		setRotationAngle(feather_r3, 0.0F, -0.3491F, 0.0F);
		feather_r3.cubeList.add(new ModelBox(feather_r3, 0, 39, 0.0F, -11.0F, 0.0F, 0, 11, 14, 0.0F, false));

		feather_r4 = new ModelRenderer(this);
		feather_r4.setRotationPoint(0.0F, -8.0F, -3.0F);
		Head.addChild(feather_r4);
		setRotationAngle(feather_r4, 0.0F, -0.6109F, 0.0F);
		feather_r4.cubeList.add(new ModelBox(feather_r4, 36, 20, 0.0F, -11.0F, 0.0F, 0, 11, 14, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -8.3279F, 0.9924F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 17, -2.5F, -2.6721F, -3.5F, 5, 2, 5, -0.2F, false));

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(0.0F, -3.0F, -2.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.7854F, 0.0F);
		Head_r2.cubeList.add(new ModelBox(Head_r2, 0, 34, -4.0F, -4.1F, -4.0F, 8, 9, 8, -0.1F, false));
		Head_r2.cubeList.add(new ModelBox(Head_r2, 32, 16, -4.0F, -4.1F, -4.0F, 8, 9, 8, 0.0F, false));

		venok = new ModelRenderer(this);
		venok.setRotationPoint(0.0F, -9.0F, 0.0F);
		Head.addChild(venok);
		setRotationAngle(venok, -0.2449F, 0.4677F, -0.1122F);
		venok.cubeList.add(new ModelBox(venok, 50, 38, 4.548F, -3.0F, -3.153F, 0, 3, 7, 0.0F, false));
		venok.cubeList.add(new ModelBox(venok, 36, 38, 4.3F, -3.0F, -3.153F, 0, 3, 7, 0.0F, false));

		venok_r1 = new ModelRenderer(this);
		venok_r1.setRotationPoint(-5.7057F, 0.0F, -0.9344F);
		venok.addChild(venok_r1);
		setRotationAngle(venok_r1, 0.0F, 2.2253F, 0.0F);
		venok_r1.cubeList.add(new ModelBox(venok_r1, 36, 38, -0.3943F, -3.0F, 0.0F, 0, 3, 7, 0.0F, false));
		venok_r1.cubeList.add(new ModelBox(venok_r1, 50, 38, 0.0F, -3.0F, 0.0F, 0, 3, 7, 0.0F, false));

		venok_r2 = new ModelRenderer(this);
		venok_r2.setRotationPoint(-2.9695F, 0.0F, 6.5832F);
		venok.addChild(venok_r2);
		setRotationAngle(venok_r2, 0.0F, -2.7925F, 0.0F);
		venok_r2.cubeList.add(new ModelBox(venok_r2, 32, 40, -0.3305F, -3.0F, 0.0F, 0, 3, 8, 0.0F, false));
		venok_r2.cubeList.add(new ModelBox(venok_r2, 48, 40, 0.0F, -3.0F, 0.0F, 0, 3, 8, 0.0F, false));

		venok_r3 = new ModelRenderer(this);
		venok_r3.setRotationPoint(4.548F, 0.0F, 3.847F);
		venok.addChild(venok_r3);
		setRotationAngle(venok_r3, 0.0F, -1.2217F, 0.0F);
		venok_r3.cubeList.add(new ModelBox(venok_r3, 32, 40, -0.248F, -3.0F, 0.0F, 0, 3, 8, 0.0F, false));
		venok_r3.cubeList.add(new ModelBox(venok_r3, 48, 40, 0.0F, -3.0F, 0.0F, 0, 3, 8, 0.0F, false));

		lenta = new ModelRenderer(this);
		lenta.setRotationPoint(2.0F, -7.0F, 5.0F);
		Head.addChild(lenta);
		setRotationAngle(lenta, -0.8262F, -1.1597F, -0.9431F);
		lenta.cubeList.add(new ModelBox(lenta, 0, 42, 0.0F, -1.0F, 0.0F, 0, 1, 9, 0.0F, false));

		lenta_r1 = new ModelRenderer(this);
		lenta_r1.setRotationPoint(0.0F, 0.0F, 9.0F);
		lenta.addChild(lenta_r1);
		setRotationAngle(lenta_r1, 0.0F, 0.5672F, 0.0F);
		lenta_r1.cubeList.add(new ModelBox(lenta_r1, 3, 46, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

		lenta2 = new ModelRenderer(this);
		lenta2.setRotationPoint(-1.0F, -7.0F, 5.0F);
		Head.addChild(lenta2);
		setRotationAngle(lenta2, 0.4492F, -1.1758F, -1.9835F);
		lenta2.cubeList.add(new ModelBox(lenta2, 0, 42, 0.0F, -1.0F, 0.0F, 0, 1, 9, 0.0F, false));

		lenta2_r1 = new ModelRenderer(this);
		lenta2_r1.setRotationPoint(0.0F, 0.0F, 9.0F);
		lenta2.addChild(lenta2_r1);
		setRotationAngle(lenta2_r1, 0.0F, 0.5672F, 0.0F);
		lenta2_r1.cubeList.add(new ModelBox(lenta2_r1, 3, 46, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));

		lenta3 = new ModelRenderer(this);
		lenta3.setRotationPoint(1.0F, -7.0F, 5.0F);
		Head.addChild(lenta3);
		setRotationAngle(lenta3, -0.6759F, -1.1104F, -0.7721F);
		lenta3.cubeList.add(new ModelBox(lenta3, 0, 42, 0.0F, -1.0F, 0.0F, 0, 1, 9, 0.0F, false));

		lenta3_r1 = new ModelRenderer(this);
		lenta3_r1.setRotationPoint(0.0F, 0.0F, 9.0F);
		lenta3.addChild(lenta3_r1);
		setRotationAngle(lenta3_r1, 0.0F, 0.5672F, 0.0F);
		lenta3_r1.cubeList.add(new ModelBox(lenta3_r1, 3, 46, 0.0F, -1.0F, 0.0F, 0, 1, 6, 0.0F, false));
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